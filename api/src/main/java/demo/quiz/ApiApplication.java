package demo.quiz;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@SpringBootApplication
public class ApiApplication {
 public static void main(String[] args){SpringApplication.run(ApiApplication.class,args);}
 @RestController @RequestMapping("/api/quiz") @CrossOrigin(origins="*")
 static class QuizApi {
  private final Map<String,List<Map<String,Object>>> bank=new LinkedHashMap<>();
  QuizApi(){bank.put("web",List.of(q("Which HTML element is used for the largest page heading?",List.of("<heading>","<h1>","<head>","<title>"),1,"The h1 element is the top-level heading."),q("Which CSS property changes text color?",List.of("font-style","background","color","text-decoration"),2,"The color property sets text foreground color.")));bank.put("java",List.of(q("Which keyword defines a Java class?",List.of("function","class","struct","object"),1,"The class keyword declares a class."),q("Which type stores true or false?",List.of("int","String","boolean","char"),2,"boolean stores true or false.")));bank.put("logic",List.of(q("What comes next: 2, 4, 8, 16, ...?",List.of("18","24","30","32"),3,"Each number doubles, so the answer is 32."),q("Which structure follows FIFO order?",List.of("Stack","Queue","Tree","Graph"),1,"A queue uses first-in, first-out order.")));}
  Map<String,Object> q(String question,List<String> choices,int answer,String explanation){return Map.of("question",question,"choices",choices,"answer",answer,"explanation",explanation);}
  @GetMapping("/questions") List<Map<String,Object>> questions(@RequestParam(defaultValue="web") String topic){return bank.getOrDefault(topic,List.of());}
  @PostMapping("/attempts") Map<String,Object> attempt(@RequestBody Map<String,Object> body){String topic=String.valueOf(body.getOrDefault("topic","web"));List<Map<String,Object>> qs=bank.getOrDefault(topic,List.of());Object raw=body.get("answers");int score=0;if(raw instanceof List<?> answers)for(int i=0;i<Math.min(answers.size(),qs.size());i++)if(answers.get(i) instanceof Number n&&n.intValue()==((Number)qs.get(i).get("answer")).intValue())score++;return Map.of("topic",topic,"score",score,"total",qs.size());}
 }
}