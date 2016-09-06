p5-scalajs
==========

[Scala.js](http://www.scala-js.org/) type facades for [p5.js](https://p5js.org/) 0.5.3.

## How

These facades were generated using [sjrd's](https://github.com/sjrd) [scala-js-ts-importer](https://github.com/sjrd/scala-js-ts-importer) and [Typescript type facades](http://processing.toolness.org/general/2016/03/16/typescript-to-the-rescue.html) provided by [toolness](https://github.com/toolness/).

## Disclaimer

These type facades are machine generated through two different layers of translation (`js/docs -> ts -> scalajs`). They are **almost certainly incorrect** in multiple places.

Types may be too broad (`js.Any`), or outright wrong.

If you use this library and notice an incongruence with the underlying p5.js API, it's very likely not your fault.
If you are able to do so, please file an issue, or, better yet, a pull request fixing the issue.
