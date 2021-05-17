
solution {
    puzzle = "P025"
    name = "NEW SOLUTION 2"
    arm(ARM1) {
        number = 1
        position = -2 to -1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -3 to -3
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 0 to 2
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 0 to -6
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 0 to -5
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 3 to -8
        rotation = -5
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -2 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 6 to -7
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 6 to -3
        rotation = -3
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 3 to -6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -3
        rotation = 0
    }
    track {
        position = 0 to -6
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = -3 to -3
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -2 to -2
        positions = listOf(0 to 0, 1 to 0, 1 to -1, 1 to -2)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(10) {
                wait(39)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(41)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
