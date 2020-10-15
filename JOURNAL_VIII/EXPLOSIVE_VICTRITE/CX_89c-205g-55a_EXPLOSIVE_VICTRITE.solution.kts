
solution {
    puzzle = "P100"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 7 to -5
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 2 to -3
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 6 to -5
        rotation = 9
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 4 to -3
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 4 to -2
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 1
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = 4 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -3
        rotation = 1
    }
    track {
        position = 1 to 0
        positions = listOf(0 to 0, 0 to -1, 0 to -2, 1 to -3, 1 to -2)
    }
    track {
        position = 7 to -4
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                back()
                reset()
                wait(2)
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(8)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
