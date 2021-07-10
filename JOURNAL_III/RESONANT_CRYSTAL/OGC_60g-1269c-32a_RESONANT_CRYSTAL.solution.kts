
solution {
    puzzle = "P066"
    name = "B AG"
    arm(PISTON) {
        number = 1
        position = 3 to -3
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = -1
    }
    io(INPUT) {
        index = 2
        position = 3 to -2
        rotation = 0
    }
    track {
        position = 2 to -2
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                rotateCounterClockwise()
                drop()
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
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                extend()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                extend()
                extend()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                retract()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                extend()
                extend()
                grab()
                retract()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
