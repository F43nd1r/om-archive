
solution {
    puzzle = "P089"
    name = "B ACX"
    arm(PISTON) {
        number = 1
        position = 1 to -2
        rotation = -2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 0 to -1
        rotation = -6
    }
    glyph(CALCIFICATION) {
        position = -4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -2
        rotation = -5
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                extend()
                extend()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                extend()
                extend()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                retract()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                retract()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                extend()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                drop()
                retract()
                rotateClockwise()
                grab()
                extend()
                retract()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                extend()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                retract()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                extend()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                drop()
                rotateClockwise()
                grab()
                extend()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                drop()
                rotateClockwise()
                grab()
                extend()
                retract()
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
