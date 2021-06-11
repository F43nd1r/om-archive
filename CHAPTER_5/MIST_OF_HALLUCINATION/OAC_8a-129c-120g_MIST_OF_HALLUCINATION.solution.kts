
solution {
    puzzle = "P038"
    name = "OAC (Copy)"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 3
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
        position = 1 to -2
        positions = listOf(0 to 0, 1 to 0, 0 to 1, 1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
