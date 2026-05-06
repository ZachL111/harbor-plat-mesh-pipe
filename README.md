# harbor-plat-mesh-pipe

`harbor-plat-mesh-pipe` is a Java project in platform engineering. Its focus is to package a Java local lab for mesh analysis with safe and unsafe fixtures, remediation hints, and documented operating limits.

## Problem It Tries To Make Smaller

I want this repository to be useful as a quick reading exercise: fixtures first, implementation second, verifier last.

## Harbor Plat Mesh Pipe Review Notes

The first comparison I would make is `secret scope` against `rollout width` because it shows where the rule is most opinionated.

## Working Pieces

- `fixtures/domain_review.csv` adds cases for rollout width and quota pressure.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/harbor-plat-mesh-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `secret scope` and `rollout width`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Design Notes

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The Java code keeps the review rule close to the tests.

## Example Run

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Tests

The check exercises the source code and the review fixture. `recovery` is the high score at 241; `stale` is the low score at 123.

## Known Limits

The fixture set is small enough to audit by hand. The next useful expansion is malformed input coverage, not extra surface area.
