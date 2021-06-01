
solution {
    puzzle = "P039"
    name = "OVERLAP AA"
    arm(PISTON) {
        number = 1
        position = -11 to -2
        rotation = 7
        size = 1
    }
    glyph(BONDER) {
        position = -10 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = -11 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -12 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -10 to -2
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -11 to -2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -11 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -11 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -11 to -1
        rotation = 0
    }
    track {
        position = -12 to -2
        positions = listOf(0 to 1, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                forward()
                drop()
                retract()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                back()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                extend()
                forward()
                reset()
            }
        }
        )
    }
}
