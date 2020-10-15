
solution {
    puzzle = "P066"
    name = "B AG"
    arm(PISTON) {
        number = 1
        position = 0 to 1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 4
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 2
        rotation = 1
    }
    io(INPUT) {
        index = 2
        position = 0 to 2
        rotation = 0
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
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
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
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
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                extend()
                drop()
                retract()
                retract()
                forward()
                grab()
                back()
                extend()
                pivotClockwise()
                forward()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                forward()
                retract()
                grab()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                extend()
                drop()
                retract()
                forward()
                grab()
                back()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                extend()
                drop()
                retract()
                forward()
                grab()
                back()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
