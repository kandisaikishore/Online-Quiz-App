# Online Quiz App — Java Project

[![Java](https://img.shields.io/badge/Java-Project-orange?logo=openjdk)](https://www.java.com/) [![Repository](https://img.shields.io/badge/GitHub-Source-181717?logo=github)](https://github.com/kandisaikishore/Online-Quiz-App)

This repository currently contains a small Java smoke-test scaffold for an online quiz project. The complete quiz interface, scoring engine, data persistence, and end-user flow should be treated as future work unless implemented in additional source files.

## Current repository contents

- `AppTest.java` — a lightweight smoke-test class
- `QA_EXECUTION.md` and `reports/` — quality-assurance notes and artefacts

## Run the current smoke test

Install a JDK, then execute:

```bash
git clone https://github.com/kandisaikishore/Online-Quiz-App.git
cd Online-Quiz-App
javac AppTest.java
java AppTest
```

Expected output for the current scaffold: `Online Quiz smoke test passed`.

## Suggested product roadmap

- Create question and answer models
- Add multiple-choice answer selection and score calculation
- Display result summaries and validate submissions
- Add categories, timers, randomization, and question persistence
- Test correct, incorrect, skipped, and empty-question cases

These items are proposed extensions, not claims that the features already exist.

## Contributing

Report defects with reproducible steps. Include tests for new quiz behaviour as the application grows.

## License

No license file is currently declared. Add a `LICENSE` file before granting reuse rights.
