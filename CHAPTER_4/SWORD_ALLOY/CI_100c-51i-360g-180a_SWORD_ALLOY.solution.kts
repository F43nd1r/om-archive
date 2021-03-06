
solution {
    puzzle = "P033"
    name = "B CI51"
    arm(ARM1) {
        number = 1
        position = -2 to 6
        rotation = 5
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 0 to 4
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 3 to -2
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 3 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -4 to 4
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = -3 to 4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 7
        position = 1 to 1
        rotation = 4
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = 1 to 2
        rotation = 0
        size = 2
    }
    arm(ARM2) {
        number = 9
        position = -3 to 3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = -5 to 3
        rotation = -1
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -2 to 3
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 2 to -1
        rotation = -5
    }
    glyph(PURIFICATION) {
        position = -1 to 4
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -14 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 5
        rotation = 0
    }
    track {
        position = -5 to 3
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(9)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(8)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(9)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(12)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        )
    }
}
