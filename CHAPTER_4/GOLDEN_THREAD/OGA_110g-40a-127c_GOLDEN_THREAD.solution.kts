
solution {
    puzzle = "P037"
    name = "OVERLAP"
    arm(PISTON) {
        number = 1
        position = -12 to 1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -10 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = -12 to 1
        rotation = 4
    }
    glyph(BONDER) {
        position = -11 to 1
        rotation = 3
    }
    glyph(BONDER) {
        position = -11 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -9 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = -9 to 0
        rotation = 4
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -12 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -11 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -11 to 1
        rotation = 0
    }
    track {
        position = -13 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                extend()
                back()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(2)
                grab()
                back()
                forward()
                extend()
                extend()
                reset()
            }
        }
        )
    }
}
