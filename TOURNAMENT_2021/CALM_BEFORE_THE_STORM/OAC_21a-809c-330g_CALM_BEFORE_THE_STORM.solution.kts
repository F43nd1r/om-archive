
solution {
    puzzle = "w2450512434"
    name = "OVERLAP AC"
    arm(PISTON) {
        number = 1
        position = 2 to 2
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = 1 to 2
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 1 to 3
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = 1 to 2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 2 to 1
        rotation = -4
    }
    glyph(PURIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 2 to 0
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = 1 to 1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 1 to 1
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = 1 to 0
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -11 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = -5
    }
    io(INFINITE) {
        index = 0
        position = -11 to 2
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = -11 to 2
        rotation = 0
    }
    track {
        position = 2 to 2
        positions = listOf(0 to 0, 0 to -1, -1 to -1, -1 to 0, -2 to 0, -3 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                drop()
                retract()
                retract()
                forward()
                grab()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                drop()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                extend()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                retract()
                forward()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                drop()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                forward()
                grab()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                drop()
                extend()
                extend()
                grab()
                retract()
                drop()
                back()
                extend()
                grab()
                retract()
                extend()
                drop()
                retract()
                retract()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                grab()
                rotateClockwise()
                extend()
                drop()
                back()
                back()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                forward()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                drop()
                extend()
                extend()
                grab()
                retract()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                extend()
                drop()
                back()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                rotateClockwise()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                back()
                back()
                back()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                forward()
                grab()
                back()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                forward()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                forward()
                extend()
                extend()
                drop()
                retract()
                retract()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                extend()
                extend()
                grab()
                retract()
                retract()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                extend()
                grab()
                retract()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                back()
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                extendTape()
                rotateClockwise()
                back()
                drop()
                extend()
                extend()
                grab()
                retract()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                back()
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                drop()
                extend()
                extend()
                grab()
                retract()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                forward()
                grab()
                back()
                extend()
                drop()
                forward()
                grab()
                retract()
                back()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                back()
                extend()
                rotateClockwise()
                extend()
                drop()
                retract()
                retract()
                grab()
                extend()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
