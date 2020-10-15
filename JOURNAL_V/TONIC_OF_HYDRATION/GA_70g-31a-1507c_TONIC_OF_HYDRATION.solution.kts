
solution {
    puzzle = "P089"
    name = "B AG"
    arm(PISTON) {
        number = 1
        position = 1 to -2
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -1
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
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -2
        rotation = -5
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
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
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                pivotClockwise()
                drop()
                retract()
                retract()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                extend()
                retract()
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
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                extend()
                pivotCounterClockwise()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                retract()
                drop()
                rotateCounterClockwise()
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
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                retract()
                drop()
                rotateCounterClockwise()
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
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                retract()
                drop()
                rotateCounterClockwise()
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
                drop()
                retract()
                retract()
                reset()
            }
        }
        )
    }
}
