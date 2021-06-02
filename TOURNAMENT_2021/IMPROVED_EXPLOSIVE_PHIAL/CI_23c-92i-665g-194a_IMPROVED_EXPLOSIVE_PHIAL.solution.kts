
solution {
    puzzle = "w2450508212"
    name = "B CI"
    arm(ARM6) {
        number = 1
        position = -3 to 5
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = -2 to 4
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to 6
        rotation = -2
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = 2 to 3
        rotation = 3
        size = 2
    }
    arm(ARM2) {
        number = 5
        position = 2 to -3
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = 3 to 3
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = 4 to 3
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 8
        position = 4 to 1
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 9
        position = 3 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 1 to 1
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 11
        position = -5 to 3
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 12
        position = -6 to 3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = -3 to -4
        rotation = 1
        size = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to 3
        rotation = 4
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 1
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -1
        rotation = 2
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to -2
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to -2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 5 to -5
        rotation = -10
    }
    glyph(TRIPLEX_BONDER) {
        position = 0 to -2
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -4
        rotation = 1
    }
    track {
        position = -3 to 5
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = -5 to 3
        positions = listOf(0 to 0, 0 to -1, 0 to -2, -1 to -1, -1 to 0)
    }
    track {
        position = 0 to 6
        positions = listOf(0 to 0, 0 to -1, 0 to -2, 1 to -3, 2 to -3, 2 to -4, 2 to -5, 1 to -5, 1 to -4)
    }
    track {
        position = 3 to 3
        positions = listOf(1 to 0, 0 to 0, 0 to -1, 0 to -2, 1 to -2, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(10) {
                wait(5)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                forward()
                forward()
                forward()
                drop()
                back()
                back()
                back()
            }
        }
        , 
        {
            sequence(11) {
                wait(2)
                grab()
                forward()
                forward()
                rotateClockwise()
                drop()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(12) {
                wait(5)
                forward()
                grab()
                forward()
                forward()
                rotateClockwise()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(7) {
                wait(1)
                forward()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(13) {
                wait(6)
                grab()
                rotateClockwise()
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
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                forward()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                back()
                back()
            }
        }
        , 
        {
            sequence(9) {
                wait(1)
                forward()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
