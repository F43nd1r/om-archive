
solution {
    puzzle = "P039"
    name = "OVERLAP AREA"
    arm(PISTON) {
        number = 1
        position = -12 to -2
        rotation = 5
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
