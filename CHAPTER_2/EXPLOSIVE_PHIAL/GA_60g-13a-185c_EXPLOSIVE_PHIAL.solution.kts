
solution {
    puzzle = "P017"
    name = "B GAX"
    arm(ARM1) {
        number = 1
        position = 2 to 0
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = 5
    }
    glyph(TRIPLEX_BONDER) {
        position = 0 to 1
        rotation = 5
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 6
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
