
solution {
    puzzle = "P038"
    name = "OVERLAP ACX"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    track {
        position = 3 to 0
        positions = listOf(-2 to -2, -1 to -2, -1 to -1, -2 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
