# Liferay Gradle Plugins Lang Builder Change Log

## 2.0.0 - 2017-04-06

### Added
- [LPS-71375]: Add the property `translateSubscriptionKey` in `BuildLangTask` to
support the Translator Text Translation API on Microsoft Cognitive Services.

### Changed
- [LPS-67573]: Make most methods private in order to reduce API surface.

### Removed
- [LPS-71375]: The properties `translateClientId` and `translateClientSecret` of
`BuildLangTask` are no longer available.

## 2.1.0 - 2017-08-21

### Added
- [LPS-74250]: Add the property `excludedLanguageIds` in `BuildLangTask` to
configure which language IDs to exclude in the automatic translation.

## 2.1.1 - 2017-11-08

### Changed
- [LPS-73725]: Update the [Liferay Lang Builder] dependency to version 1.0.15.

## 2.1.2 - 2017-11-08

### Changed
- [LPS-73725]: Update the [Liferay Lang Builder] dependency to version 1.0.16.

## 2.1.3 - 2017-11-08

### Changed
- [LPS-73725]: Update the [Liferay Lang Builder] dependency to version 1.0.17.

## 2.1.4 - 2017-11-08

### Changed
- [LPS-73725]: Update the [Liferay Lang Builder] dependency to version 1.0.18.

## 2.1.5 - 2017-12-04

### Changed
- [LPS-76221]: Update the [Liferay Lang Builder] dependency to version 1.0.19.

## 2.1.6 - 2017-12-05

### Changed
- [LPS-76221]: Update the [Liferay Lang Builder] dependency to version 1.0.20.

## 2.1.7 - 2017-12-20

### Changed
- [LPS-76221]: Update the [Liferay Lang Builder] dependency to version 1.0.21.

## 2.1.8 - 2017-12-20

### Changed
- [LPS-76221]: Update the [Liferay Lang Builder] dependency to version 1.0.22.

[Liferay Lang Builder]: https://github.com/liferay/liferay-portal/tree/master/modules/util/lang-builder
[LPS-67573]: https://issues.liferay.com/browse/LPS-67573
[LPS-71375]: https://issues.liferay.com/browse/LPS-71375
[LPS-73725]: https://issues.liferay.com/browse/LPS-73725
[LPS-74250]: https://issues.liferay.com/browse/LPS-74250
[LPS-76221]: https://issues.liferay.com/browse/LPS-76221