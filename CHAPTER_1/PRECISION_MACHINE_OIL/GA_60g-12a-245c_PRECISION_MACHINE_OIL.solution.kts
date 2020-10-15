
solution {
    puzzle = "P012"
    name = "B GAX"
    arm(ARM1) {
        number = 1
        position = 2 to 0
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 3
    }
    glyph(PROJECTION) {
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = 4 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to 0
        rotation = 0
    }
    track {
        position = 3 to 0
        positions = listOf(-1 to 0, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                back()
                drop()
                forward()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
