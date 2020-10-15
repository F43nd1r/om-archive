
solution {
    puzzle = "P086"
    name = "B AC"
    arm(PISTON) {
        number = 1
        position = -3 to -3
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = -6
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = -6
    }
    glyph(ANIMISMUS) {
        position = -5 to -1
        rotation = -18
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = -6
    }
    io(INPUT) {
        index = 3
        position = -6 to 0
        rotation = 0
    }
    track {
        position = -1 to -3
        positions = listOf(-2 to 0, -1 to 0, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                grab()
                retract()
                drop()
                extend()
                grab()
                forward()
                retract()
                drop()
                extend()
                grab()
                forward()
                retract()
                retract()
                pivotCounterClockwise()
                drop()
                back()
                back()
                grab()
                forward()
                rotateClockwise()
                extend()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                back()
                extend()
                grab()
                retract()
                forward()
                drop()
                back()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                forward()
                drop()
                back()
                extend()
                grab()
                retract()
                drop()
                retract()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                forward()
                retract()
                retract()
                drop()
                back()
                back()
                grab()
                forward()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                forward()
                back()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                back()
                forward()
                drop()
                back()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                grab()
                extend()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                retract()
                rotateClockwise()
                drop()
                rotateClockwise()
                forward()
                extend()
                grab()
                back()
                pivotClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                retract()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                forward()
                drop()
                back()
                extend()
                grab()
                retract()
                drop()
                retract()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                extend()
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                retract()
                forward()
                back()
                extend()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                retract()
                extend()
                extend()
                drop()
                retract()
                reset()
            }
        }
        )
    }
}
