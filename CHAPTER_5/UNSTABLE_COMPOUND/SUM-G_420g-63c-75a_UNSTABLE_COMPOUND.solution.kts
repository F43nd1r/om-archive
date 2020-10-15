
solution {
    puzzle = "P040"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = -5 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -8 to 5
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -4 to 2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -3 to 4
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -3 to 5
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -2 to 5
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 2 to -4
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 0 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 0 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 2 to -3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 1 to -2
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to -1
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to -2
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to -2
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to 2
        rotation = 0
    }
    track {
        position = -2 to -4
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 2 to 1, 3 to 0, 4 to 0)
    }
    track {
        position = -3 to 4
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
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
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(8)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
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
            sequence(5) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                forward()
                grab()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(9)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                back()
                pivotCounterClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
