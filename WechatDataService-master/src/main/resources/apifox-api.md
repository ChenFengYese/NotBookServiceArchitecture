# NotBookController

NotBookController


---
## Test

> BASIC

**Path:** textif/test

**Method:** GET

> REQUEST




---
## gif

> BASIC

**Path:** textif/getif

**Method:** GET

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| uid |  | NO |  |
| suid |  | NO |  |
| title |  | NO |  |
| time |  | NO |  |
| text |  | NO |  |
| collect |  | NO |  |
| deleted |  | NO |  |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| defaultTimeZone | object |  |
| &ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| defaultLocale | object |  |
| &ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| DEFAULT_TYPE_KEY | string |  |
| DEFFAULT_DATE_FORMAT | string |  |
| DEFAULT_PARSER_FEATURE | integer |  |
| DEFAULT_GENERATE_FEATURE | integer |  |

**Response Demo:**

```json
{
  "defaultTimeZone": {
    "ID": "",
    "defaultTimeZone": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    },
    "mainAppContextDefault": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    }
  },
  "defaultLocale": {
    "defaultLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultDisplayLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultFormatLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "isoLanguages": [
      ""
    ],
    "isoCountries": [
      ""
    ]
  },
  "DEFAULT_TYPE_KEY": "",
  "DEFFAULT_DATE_FORMAT": "",
  "DEFAULT_PARSER_FEATURE": 0,
  "DEFAULT_GENERATE_FEATURE": 0
}
```




---
## sortBySuid

> BASIC

**Path:** textif/sortBySuid

**Method:** GET

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| uid |  | NO |  |
| suid |  | NO |  |
| title |  | NO |  |
| time |  | NO |  |
| text |  | NO |  |
| collect |  | NO |  |
| deleted |  | NO |  |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| defaultTimeZone | object |  |
| &ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| defaultLocale | object |  |
| &ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| DEFAULT_TYPE_KEY | string |  |
| DEFFAULT_DATE_FORMAT | string |  |
| DEFAULT_PARSER_FEATURE | integer |  |
| DEFAULT_GENERATE_FEATURE | integer |  |

**Response Demo:**

```json
{
  "defaultTimeZone": {
    "ID": "",
    "defaultTimeZone": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    },
    "mainAppContextDefault": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    }
  },
  "defaultLocale": {
    "defaultLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultDisplayLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultFormatLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "isoLanguages": [
      ""
    ],
    "isoCountries": [
      ""
    ]
  },
  "DEFAULT_TYPE_KEY": "",
  "DEFFAULT_DATE_FORMAT": "",
  "DEFAULT_PARSER_FEATURE": 0,
  "DEFAULT_GENERATE_FEATURE": 0
}
```




---
## sortByCollect

> BASIC

**Path:** textif/sortByCollect

**Method:** GET

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| uid |  | NO |  |
| suid |  | NO |  |
| title |  | NO |  |
| time |  | NO |  |
| text |  | NO |  |
| collect |  | NO |  |
| deleted |  | NO |  |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
|  | array |  |
|  | object |  |
| &ensp;&ensp;&#124;─uid | string |  |
| &ensp;&ensp;&#124;─suid | integer |  |
| &ensp;&ensp;&#124;─title | string |  |
| &ensp;&ensp;&#124;─time | string |  |
| &ensp;&ensp;&#124;─text | string |  |
| &ensp;&ensp;&#124;─collect | string |  |
| &ensp;&ensp;&#124;─deleted | string |  |

**Response Demo:**

```json
[
  {
    "uid": "",
    "suid": 0,
    "title": "",
    "time": "",
    "text": "",
    "collect": "",
    "deleted": ""
  }
]
```




---
## gif_s

> BASIC

**Path:** textif/getif_s

**Method:** GET

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| uid |  | NO |  |
| suid |  | NO |  |
| title |  | NO |  |
| time |  | NO |  |
| text |  | NO |  |
| collect |  | NO |  |
| deleted |  | NO |  |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| defaultTimeZone | object |  |
| &ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| defaultLocale | object |  |
| &ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| DEFAULT_TYPE_KEY | string |  |
| DEFFAULT_DATE_FORMAT | string |  |
| DEFAULT_PARSER_FEATURE | integer |  |
| DEFAULT_GENERATE_FEATURE | integer |  |

**Response Demo:**

```json
{
  "defaultTimeZone": {
    "ID": "",
    "defaultTimeZone": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    },
    "mainAppContextDefault": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    }
  },
  "defaultLocale": {
    "defaultLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultDisplayLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultFormatLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "isoLanguages": [
      ""
    ],
    "isoCountries": [
      ""
    ]
  },
  "DEFAULT_TYPE_KEY": "",
  "DEFFAULT_DATE_FORMAT": "",
  "DEFAULT_PARSER_FEATURE": 0,
  "DEFAULT_GENERATE_FEATURE": 0
}
```




---
## addif

> BASIC

**Path:** textif/addif

**Method:** GET

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| uid |  | NO |  |
| suid |  | NO |  |
| title |  | NO |  |
| time |  | NO |  |
| text |  | NO |  |
| collect |  | NO |  |
| deleted |  | NO |  |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| defaultTimeZone | object |  |
| &ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| defaultLocale | object |  |
| &ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| DEFAULT_TYPE_KEY | string |  |
| DEFFAULT_DATE_FORMAT | string |  |
| DEFAULT_PARSER_FEATURE | integer |  |
| DEFAULT_GENERATE_FEATURE | integer |  |

**Response Demo:**

```json
{
  "defaultTimeZone": {
    "ID": "",
    "defaultTimeZone": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    },
    "mainAppContextDefault": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    }
  },
  "defaultLocale": {
    "defaultLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultDisplayLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultFormatLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "isoLanguages": [
      ""
    ],
    "isoCountries": [
      ""
    ]
  },
  "DEFAULT_TYPE_KEY": "",
  "DEFFAULT_DATE_FORMAT": "",
  "DEFAULT_PARSER_FEATURE": 0,
  "DEFAULT_GENERATE_FEATURE": 0
}
```




---
## SUID_AUTO_INCREMENT

> BASIC

**Path:** textif/getsuidlist

**Method:** GET

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| uid |  | NO |  |
| suid |  | NO |  |
| title |  | NO |  |
| time |  | NO |  |
| text |  | NO |  |
| collect |  | NO |  |
| deleted |  | NO |  |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
|  | array |  |
|  | integer |  |

**Response Demo:**

```json
[
  0
]
```




---
## GET_TITLE_LIST

> BASIC

**Path:** textif/gettitlelist

**Method:** GET

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| uid |  | NO |  |
| suid |  | NO |  |
| title |  | NO |  |
| time |  | NO |  |
| text |  | NO |  |
| collect |  | NO |  |
| deleted |  | NO |  |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
|  | string |  |

**Response Demo:**

```json

```




---
## deleteif

> BASIC

**Path:** textif/deleteif

**Method:** GET

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| uid |  | NO |  |
| suid |  | NO |  |
| title |  | NO |  |
| time |  | NO |  |
| text |  | NO |  |
| collect |  | NO |  |
| deleted |  | NO |  |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| defaultTimeZone | object |  |
| &ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| defaultLocale | object |  |
| &ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| DEFAULT_TYPE_KEY | string |  |
| DEFFAULT_DATE_FORMAT | string |  |
| DEFAULT_PARSER_FEATURE | integer |  |
| DEFAULT_GENERATE_FEATURE | integer |  |

**Response Demo:**

```json
{
  "defaultTimeZone": {
    "ID": "",
    "defaultTimeZone": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    },
    "mainAppContextDefault": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    }
  },
  "defaultLocale": {
    "defaultLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultDisplayLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultFormatLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "isoLanguages": [
      ""
    ],
    "isoCountries": [
      ""
    ]
  },
  "DEFAULT_TYPE_KEY": "",
  "DEFFAULT_DATE_FORMAT": "",
  "DEFAULT_PARSER_FEATURE": 0,
  "DEFAULT_GENERATE_FEATURE": 0
}
```




---
## aif

> BASIC

**Path:** textif/alterif

**Method:** GET

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| uid |  | NO |  |
| suid |  | NO |  |
| title |  | NO |  |
| time |  | NO |  |
| text |  | NO |  |
| collect |  | NO |  |
| deleted |  | NO |  |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| defaultTimeZone | object |  |
| &ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| defaultLocale | object |  |
| &ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| DEFAULT_TYPE_KEY | string |  |
| DEFFAULT_DATE_FORMAT | string |  |
| DEFAULT_PARSER_FEATURE | integer |  |
| DEFAULT_GENERATE_FEATURE | integer |  |

**Response Demo:**

```json
{
  "defaultTimeZone": {
    "ID": "",
    "defaultTimeZone": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    },
    "mainAppContextDefault": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    }
  },
  "defaultLocale": {
    "defaultLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultDisplayLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultFormatLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "isoLanguages": [
      ""
    ],
    "isoCountries": [
      ""
    ]
  },
  "DEFAULT_TYPE_KEY": "",
  "DEFFAULT_DATE_FORMAT": "",
  "DEFAULT_PARSER_FEATURE": 0,
  "DEFAULT_GENERATE_FEATURE": 0
}
```




---
## collectBySuid

> BASIC

**Path:** textif/collectBySuid

**Method:** GET

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| uid |  | NO |  |
| suid |  | NO |  |
| title |  | NO |  |
| time |  | NO |  |
| text |  | NO |  |
| collect |  | NO |  |
| deleted |  | NO |  |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| defaultTimeZone | object |  |
| &ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| defaultLocale | object |  |
| &ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| DEFAULT_TYPE_KEY | string |  |
| DEFFAULT_DATE_FORMAT | string |  |
| DEFAULT_PARSER_FEATURE | integer |  |
| DEFAULT_GENERATE_FEATURE | integer |  |

**Response Demo:**

```json
{
  "defaultTimeZone": {
    "ID": "",
    "defaultTimeZone": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    },
    "mainAppContextDefault": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    }
  },
  "defaultLocale": {
    "defaultLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultDisplayLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultFormatLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "isoLanguages": [
      ""
    ],
    "isoCountries": [
      ""
    ]
  },
  "DEFAULT_TYPE_KEY": "",
  "DEFFAULT_DATE_FORMAT": "",
  "DEFAULT_PARSER_FEATURE": 0,
  "DEFAULT_GENERATE_FEATURE": 0
}
```




---
## searchByArgs

> BASIC

**Path:** textif/searchByArgs

**Method:** GET

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| uid |  | NO |  |
| args |  | NO |  |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| defaultTimeZone | object |  |
| &ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| &ensp;&ensp;&ensp;&ensp;&#124;─ID | string | The string identifier of this <code>TimeZone</code>.  This is a<br>programmatic identifier used internally to look up <code>TimeZone</code><br>objects from the system table and also to map them to their localized<br>display names.  <code>ID</code> values are unique in the system<br>table but may not be for dynamically created zones. |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultTimeZone | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─mainAppContextDefault | object | a static TimeZone we can reference if no AppContext is in place |
| defaultLocale | object |  |
| &ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultDisplayLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─defaultFormatLocale | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoLanguages | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| &ensp;&ensp;&#124;─isoCountries | array |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | string |  |
| DEFAULT_TYPE_KEY | string |  |
| DEFFAULT_DATE_FORMAT | string |  |
| DEFAULT_PARSER_FEATURE | integer |  |
| DEFAULT_GENERATE_FEATURE | integer |  |

**Response Demo:**

```json
{
  "defaultTimeZone": {
    "ID": "",
    "defaultTimeZone": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    },
    "mainAppContextDefault": {
      "ID": "",
      "defaultTimeZone": {},
      "mainAppContextDefault": {}
    }
  },
  "defaultLocale": {
    "defaultLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultDisplayLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "defaultFormatLocale": {
      "defaultLocale": {},
      "defaultDisplayLocale": {},
      "defaultFormatLocale": {},
      "isoLanguages": [
        ""
      ],
      "isoCountries": [
        ""
      ]
    },
    "isoLanguages": [
      ""
    ],
    "isoCountries": [
      ""
    ]
  },
  "DEFAULT_TYPE_KEY": "",
  "DEFFAULT_DATE_FORMAT": "",
  "DEFAULT_PARSER_FEATURE": 0,
  "DEFAULT_GENERATE_FEATURE": 0
}
```



