
solution {
    puzzle = "P100"
    name = "B CI45"
    arm(ARM1) {
        number = 1
        position = 0 to -3
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 6 to -6
        rotation = 9
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 5 to -6
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to -4
        rotation = 5
        size = 2
    }
    arm(ARM3) {
        number = 5
        position = 1 to -1
        rotation = 5
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 3 to -4
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 4 to -1
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 2
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -6
        rotation = 0
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 1 to -3
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(5)
                grab()
                forward()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
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
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        )
    }
}
