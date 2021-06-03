
solution {
    puzzle = "P085"
    name = "OVERLAP AREA"
    arm(PISTON) {
        number = 1
        position = 8 to 8
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -5 to 10
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 10
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 10
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 10
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 10
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 8
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 8
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 8
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 8
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to 8
        rotation = 0
    }
    glyph(BONDER) {
        position = 6 to 9
        rotation = -2
    }
    glyph(BONDER) {
        position = 5 to 10
        rotation = -1
    }
    glyph(BONDER) {
        position = 5 to 10
        rotation = 0
    }
    glyph(BONDER) {
        position = 7 to 9
        rotation = 2
    }
    glyph(BONDER) {
        position = 7 to 8
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to 10
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 10
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 10
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 10
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to 8
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 8
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 8
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 8
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to 8
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to 10
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -4 to 8
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 8 to 7
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 8 to 9
        rotation = 0
    }
    track {
        position = 8 to 8
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                extend()
                drop()
                retract()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                extend()
                drop()
                back()
                reset()
            }
        }
        )
    }
}
