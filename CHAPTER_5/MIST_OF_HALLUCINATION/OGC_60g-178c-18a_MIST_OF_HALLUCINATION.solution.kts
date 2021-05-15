
solution {
    puzzle = "P038"
    name = "OG"
    arm(ARM1) {
        number = 1
        position = -5 to 0
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = -5 to 0
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -3 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -5 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -6 to 0
        rotation = 0
    }
    track {
        position = -4 to -1
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
