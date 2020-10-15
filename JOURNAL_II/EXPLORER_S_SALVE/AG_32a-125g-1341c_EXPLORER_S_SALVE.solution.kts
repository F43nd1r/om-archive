
solution {
    puzzle = "P059"
    name = "B AA"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -4 to -1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 2 to -4
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -3
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -3 to -2
        rotation = 5
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -4
        rotation = 1
    }
    io(INPUT) {
        index = 2
        position = 2 to -5
        rotation = 0
    }
    track {
        position = 2 to -4
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(17)
                rotateClockwise()
                rotateClockwise()
                wait(42)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(46)
                rotateClockwise()
                rotateClockwise()
                wait(90)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                rotateClockwise()
                extend()
                drop()
                rotateClockwise()
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                grab()
                forward()
                rotateClockwise()
                back()
                back()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                back()
                pivotCounterClockwise()
                forward()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                grab()
                forward()
                forward()
                back()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                grab()
                forward()
                forward()
                back()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                back()
                drop()
                extend()
                grab()
                forward()
                retract()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                extend()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                back()
                extend()
                drop()
                forward()
                extend()
                grab()
                retract()
                forward()
                drop()
                back()
                back()
                grab()
                retract()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                forward()
                forward()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                retract()
                extend()
                forward()
                drop()
                retract()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                extend()
                drop()
                rotateClockwise()
                grab()
                retract()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                retract()
                pivotClockwise()
                forward()
                back()
                pivotCounterClockwise()
                drop()
                back()
                extend()
                grab()
                retract()
                extend()
                reset()
            }
        }
        )
    }
}
