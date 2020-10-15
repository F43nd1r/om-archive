
solution {
    puzzle = "P063"
    name = "B AC"
    arm(PISTON) {
        number = 1
        position = -3 to 5
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -3 to 4
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 5
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 2
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -1 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 4
        rotation = 0
    }
    track {
        position = -3 to 4
        positions = listOf(2 to -1, 2 to -2, 1 to -1, 0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                extend()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                extend()
                drop()
                wait(2)
                grab()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                retract()
                drop()
                back()
                wait(3)
                grab()
                extend()
                drop()
                forward()
                grab()
                retract()
                extend()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(4)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                back()
                drop()
                retract()
                grab()
                forward()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(2)
                grab()
                extend()
                reset()
                wait(4)
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                retract()
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                retract()
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                extend()
                back()
                pivotCounterClockwise()
                extend()
                forward()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                retract()
                retract()
                forward()
                back()
                extend()
                drop()
                back()
                wait(6)
                grab()
                extend()
                forward()
                pivotClockwise()
                forward()
                drop()
                retract()
                back()
                back()
                grab()
                extend()
                forward()
                pivotClockwise()
                forward()
                back()
                retract()
                retract()
                drop()
                forward()
                grab()
                back()
                extend()
                wait(3)
                forward()
                pivotClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                extend()
                pivotClockwise()
                retract()
                forward()
                extend()
                pivotClockwise()
                wait(2)
                pivotCounterClockwise()
                wait(4)
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                extend()
                forward()
                drop()
                retract()
                grab()
                extend()
                pivotClockwise()
                back()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                back()
                extend()
                drop()
                forward()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                forward()
                drop()
                rotateClockwise()
                wait(6)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                extend()
                back()
                reset()
            }
        }
        )
    }
}
