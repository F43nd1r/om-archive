
solution {
    puzzle = "P025"
    name = "CI"
    arm(ARM1) {
        number = 1
        position = -3 to 1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -3 to 4
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -3 to 3
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -4 to 0
        rotation = 6
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -2 to 0
        rotation = 5
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = -1 to 4
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -4 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -3 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -1 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 5 to -7
        rotation = -4
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 6 to 0
        rotation = -2
        size = 3
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 1 to -3
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    track {
        position = -4 to -1
        positions = listOf(2 to -2, 2 to -1, 1 to -1, 0 to 0, 0 to 1)
    }
    track {
        position = -3 to 4
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(9) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
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
            sequence(2) {
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(37)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(39)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                back()
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                back()
                back()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
