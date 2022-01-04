%dw 2.0
import * from dw::test::Asserts
---
payload must equalTo([
  {
    "account_number": 100,
    "address": "gudur",
    "name": "lokesh",
    "mobile": 98499
  },
  {
    "account_number": 101,
    "address": "nelore",
    "name": "lokesh",
    "mobile": 98499
  },
  {
    "account_number": 102,
    "address": "hyd",
    "name": "sumanth",
    "mobile": 98497
  },
  {
    "account_number": 103,
    "address": "hyd",
    "name": "sumanth",
    "mobile": 98497
  }
])