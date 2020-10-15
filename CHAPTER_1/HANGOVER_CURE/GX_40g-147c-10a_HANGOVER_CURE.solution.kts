
solution {
    puzzle = "P013"
    name = "B GAX"
    arm(ARM1) {
        number = 1
        position = 0 to 2
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = 4
    }
    glyph(CALCIFICATION) {
        position = 2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 3
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
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
