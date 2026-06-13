1. Compile time Error
2. Runtime Error:- So An Exception is a runtime error , which occurs during the excution of a program
3. Logical Error




**Complete hierarchy (commonly used):**

```markdown
Object
│
└── Throwable
    │
    ├── Error
    │   ├── ThreadDeath
    │   ├── LinkageError
    │   ├── IOError
    │   └── VirtualMachineError
    │       ├── OutOfMemoryError
    │       └── StackOverflowError
    │
    └── Exception
        │
        ├── RuntimeException(UnChecked Exceptions)
        │   ├── ArithmeticException
        │   ├── NullPointerException
        │   ├── ArrayIndexOutOfBoundsException
        │   └── NumberFormatException
        │
        └── Checked Exceptions
            ├── IOException
            ├── SQLException
            ├── ClassNotFoundException
            └── InterruptedException