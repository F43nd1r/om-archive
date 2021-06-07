
solution {
    puzzle = "P019"
    name = "OGA?"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = -3
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
