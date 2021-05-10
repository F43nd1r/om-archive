
solution {
    puzzle = "P008"
    name = "NEW SOLUTION 7"
    arm(ARM3) {
        number = 1
        position = -8 to -6
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -10 to -7
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -6 to -8
        rotation = 1
        size = 3
    }
    arm(ARM3) {
        number = 4
        position = -8 to -2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -12 to -1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -11 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -13 to 2
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -10 to 1
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -12 to 1
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -11 to 0
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -10 to -5
        rotation = -1
    }
    glyph(BONDER) {
        position = -10 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = -11 to -1
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -9 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -10 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -9 to -3
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -10 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -12 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -8 to -7
        rotation = 0
    }
    track {
        position = -11 to 1
        positions = listOf(2 to -1, 1 to -1, 0 to 0, 1 to 0)
    }
    track {
        position = -14 to 3
        positions = listOf(2 to -2, 1 to -2, 0 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                back()
                back()
                back()
                drop()
                back()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                back()
                back()
                back()
                drop()
                back()
            }
        }
        , 
        {
            sequence(9) {
                wait(3)
                back()
                grab()
                back()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
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
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
