
solution {
    puzzle = "w2450560971"
    name = "OVERLAP AG"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = 0
        size = 1
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 0
        rotation = -4
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = -5
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -3
    }
    glyph(PROJECTION) {
        position = -1 to 1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 0 to 1
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 0 to 0
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to -1, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
