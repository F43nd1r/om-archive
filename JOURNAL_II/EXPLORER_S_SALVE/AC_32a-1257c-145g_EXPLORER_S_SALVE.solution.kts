
solution {
    puzzle = "P059"
    name = "B AC"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -4 to -1
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to -4
        rotation = 0
        size = 2
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
    glyph(DUPLICATION) {
        position = -3 to -1
        rotation = 7
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
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                back()
                back()
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
                back()
                extend()
                extend()
                grab()
                retract()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                extend()
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
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                extend()
                extend()
                grab()
                retract()
                forward()
                drop()
                rotateClockwise()
                back()
                back()
                grab()
                forward()
                retract()
                forward()
                drop()
                back()
                extend()
                extend()
                grab()
                retract()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
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
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                retract()
                rotateCounterClockwise()
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
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(11)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(42)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(46)
                rotateClockwise()
                rotateClockwise()
                wait(17)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(62)
                rotateClockwise()
                wait(9)
                reset()
            }
        }
        )
    }
}
