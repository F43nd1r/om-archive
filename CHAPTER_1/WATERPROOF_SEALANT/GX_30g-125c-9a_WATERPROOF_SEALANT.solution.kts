
solution {
    puzzle = "P011"
    name = "B GAX"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
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
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
