
solution {
    puzzle = "P107"
    name = "B AA 7T"
    arm(PISTON) {
        number = 1
        position = 2 to 1
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to 0
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 3 to 2
        rotation = -2
    }
    glyph(UNIFICATION) {
        position = 2 to -1
        rotation = -1
    }
    glyph(DISPERSION) {
        position = 1 to 3
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 5 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 2
        rotation = 0
    }
    track {
        position = 3 to 1
        positions = listOf(-2 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                extend()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                forward()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                extend()
                pivotClockwise()
                back()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                extend()
                grab()
                back()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                back()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                grab()
                back()
                forward()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                back()
                rotateClockwise()
                forward()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                extend()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                back()
                retract()
                pivotClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                pivotClockwise()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                rotateClockwise()
                back()
                drop()
                retract()
                forward()
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                retract()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                forward()
                drop()
                retract()
                rotateClockwise()
                grab()
                back()
                forward()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                extend()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                forward()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                rotateClockwise()
                grab()
                back()
                retract()
                pivotClockwise()
                forward()
                rotateClockwise()
                extend()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                retract()
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                retract()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                forward()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                back()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                extend()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                forward()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                rotateClockwise()
                grab()
                back()
                retract()
                pivotClockwise()
                forward()
                rotateClockwise()
                extend()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                retract()
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                retract()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                forward()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                back()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                extend()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                forward()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                rotateClockwise()
                grab()
                back()
                retract()
                pivotClockwise()
                forward()
                rotateClockwise()
                extend()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                retract()
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                retract()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                forward()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                back()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                extend()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                forward()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                rotateClockwise()
                grab()
                back()
                retract()
                pivotClockwise()
                forward()
                rotateClockwise()
                extend()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                retract()
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                retract()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                forward()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                back()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                extend()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                rotateClockwise()
                grab()
                back()
                retract()
                pivotClockwise()
                forward()
                rotateClockwise()
                extend()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                retract()
                forward()
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                retract()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                back()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                extend()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                forward()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                rotateClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                retract()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                pivotClockwise()
                retract()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                pivotClockwise()
                back()
                drop()
                retract()
                forward()
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                retract()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                extend()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                retract()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
