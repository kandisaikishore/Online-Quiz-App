# Development and QA Guide

The checked-in repository currently includes a lightweight Java smoke-test scaffold. Treat the full quiz interface, question bank, scoring engine, and persistence as planned until those features exist in source.

## Run the current smoke test

Install a JDK, then run from the repository root:

```bash
javac AppTest.java
java AppTest
```

The scaffold is expected to print `Online Quiz smoke test passed`. This verifies the scaffold only; it does not validate a complete quiz application.

## QA execution

Before changing the test scaffold, confirm the documented expected output and inspect `QA_EXECUTION.md` and the `reports/` directory for prior test notes. Keep test evidence reproducible and do not record a pass unless the command actually ran successfully.

## Test plan for future quiz functionality

When the corresponding features are implemented, add tests for:
- Question data with missing prompts or no answer choices
- Correct, incorrect, skipped, and unanswered questions
- Score calculation and score boundaries
- Empty quiz sets and malformed question data
- Repeated submission and duplicate attempts, if attempts are persisted
- Timer expiry and restart behavior, if a timer is implemented
- Persistence and retrieval failures, if storage is added

## Pull-request checklist

- [ ] Run `javac AppTest.java && java AppTest` for changes to the existing scaffold.
- [ ] Add tests for any new behavior rather than relying on a placeholder smoke test.
- [ ] Keep planned features separate from implemented features in the README.
- [ ] Include the command run and its actual output in the PR description.
- [ ] State any checks that could not be run.
