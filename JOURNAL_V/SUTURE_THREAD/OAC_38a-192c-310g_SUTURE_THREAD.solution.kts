
solution {
    puzzle = "P085"
    name = "OVERLAP AA"
    arm(PISTON) {
        number = 1
        position = 1 to -2
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -12 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -10 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -8 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -10 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -8 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -11 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -9 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -7 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -11 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -9 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -7 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -11 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                extend()
                drop()
                retract()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                extend()
                drop()
                retract()
                back()
                reset()
            }
        }
        )
    }
}
