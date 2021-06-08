
solution {
    puzzle = "P012"
    name = "OVERLAP AC"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -1 to -1
        rotation = 5
    }
    glyph(PROJECTION) {
        position = 0 to -1
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 0
        rotation = 0
    }
    track {
        position = -1 to 0
        positions = listOf(1 to -1, 0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
