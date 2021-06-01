
solution {
    puzzle = "P034"
    name = "OVERLAP AREA REBIX, IMPROVED"
    arm(PISTON) {
        number = 1
        position = -1 to 0
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -5
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -3 to -1
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -5 to 0
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, -1 to 1, -2 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                drop()
                extend()
                extend()
                grab()
                back()
                back()
                drop()
                retract()
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
                retract()
                forward()
                forward()
                rotateClockwise()
                extend()
                grab()
                retract()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                reset()
            }
        }
        )
    }
}
