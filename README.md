# Online Quiz App — Java Project

[![Java](https://img.shields.io/badge/Java-Project-orange?logo=openjdk)](https://www.java.com/) [![Source](https://img.shields.io/badge/Source-GitHub-181717?logo=github)](https://github.com/kandisaikishore/Online-Quiz-App)

This repository is the starting point for a Java online-quiz application. The checked-in code currently includes a lightweight smoke-test scaffold; the full quiz interface, question bank, scoring engine, and persistence should be considered planned work unless added to the source.

## Current repository contents

- `AppTest.java` — smoke-test source
- `QA_EXECUTION.md` and `reports/` — QA notes and execution artifacts
- `README.md` — project overview and roadmap

## Run the current smoke test

Install a JDK, then run:

```bash
git clone https://github.com/kandisaikishore/Online-Quiz-App.git
cd Online-Quiz-App
javac AppTest.java
java AppTest
```

The current test scaffold is expected to print `Online Quiz smoke test passed`. This validates the scaffold only; it does not demonstrate a complete quiz product.

## Product roadmap

- Model questions, choices, and correct answers
- Add answer selection and score calculation
- Present a result summary after submission
- Add categories, optional timers, and question randomization
- Persist question sets and results if required
- Test correct, incorrect, skipped, and empty-question cases

Roadmap items are proposed extensions, not claims that the functionality is already implemented.

## Contributing

Report issues with reproducible steps. For new quiz functionality, include tests for the changed behaviour.

## License

No license file is currently declared. Add a `LICENSE` file before defining reuse and redistribution rights.


## REST API and browser UI

The browser interface now calls a Java Spring Boot REST API. Install JDK 17+ and Maven, then start the API from the repository root:

```bash
cd api
mvn spring-boot:run
```

Open the UI at `http://localhost:8084/`. The API uses port 8084. API endpoints are under `/api`. Current API data is held in server memory and resets when the process restarts; configure a database before production use. The API module is separate from the original console/Swing classes, so it does not share their in-process state.
