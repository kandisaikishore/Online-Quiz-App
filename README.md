# Online Quiz App — Java Project Scaffold

[![Java](https://img.shields.io/badge/Java-Project-orange?logo=openjdk)](https://www.java.com/) [![GitHub](https://img.shields.io/badge/Source-GitHub-181717?logo=github)](https://github.com/saikishore2410/Online-Quiz-App)

This repository currently contains a small Java smoke-test scaffold for an online quiz project. The full question interface, scoring engine, persistence, and user workflow are not present in the currently tracked source files.

## Current contents
- AppTest.java — a simple Java smoke test
- QA_EXECUTION.md and reports/ — quality-assurance artefacts

## Run the current smoke test
Install a JDK, then run:

    git clone https://github.com/saikishore2410/Online-Quiz-App.git
    cd Online-Quiz-App
    javac AppTest.java
    java AppTest

Expected output: Online Quiz smoke test passed

## Suggested product direction
- Question and answer models
- Multiple-choice answer selection and score calculation
- Result summary and validation
- Categories, timer, randomization, and question persistence
- Unit tests for correct, incorrect, skipped, and empty-question cases

These are suggested extensions, not features claimed to be implemented today.

## Contributing
Report defects with reproducible steps and include tests for new quiz behaviour.

## License
No license file is currently declared. Add one before granting reuse permissions.
