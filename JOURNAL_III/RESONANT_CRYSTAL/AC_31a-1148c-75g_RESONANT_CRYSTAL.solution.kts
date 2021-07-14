
solution {
    puzzle = "P066"
    name = "B AG"
    arm(PISTON) {
        number = 1
        position = 1 to -2
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -1
        rotation = 0
    }
    track {
        position = 1 to -3
        positions = listOf(0 to 1, -1 to 1, -2 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                extend()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                forward()
                pivotCounterClockwise()
                back()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                extend()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                extend()
                grab()
                back()
                forward()
                extend()
                pivotClockwise()
                drop()
                retract()
                grab()
                extend()
                pivotClockwise()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                extend()
                grab()
                back()
                forward()
                extend()
                pivotClockwise()
                drop()
                retract()
                grab()
                extend()
                pivotClockwise()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
