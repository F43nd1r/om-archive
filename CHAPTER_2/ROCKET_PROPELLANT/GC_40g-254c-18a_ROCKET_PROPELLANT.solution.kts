
solution {
    puzzle = "P019"
    name = "B GAX"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
