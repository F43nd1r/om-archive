
solution {
    puzzle = "P063"
    name = "B AG"
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
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 3
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
        positions = listOf(1 to -1, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                extend()
                back()
                pivotCounterClockwise()
                extend()
                forward()
                back()
                drop()
                retract()
                forward()
                grab()
                extend()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                drop()
                retract()
                forward()
                grab()
                pivotCounterClockwise()
                extend()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                back()
                grab()
                extend()
                extend()
                forward()
                pivotClockwise()
                drop()
                retract()
                back()
                grab()
                extend()
                forward()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                retract()
                back()
                grab()
                extend()
                extend()
                forward()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                retract()
                back()
                grab()
                extend()
                extend()
                forward()
                back()
                retract()
                retract()
                drop()
                forward()
                extend()
                grab()
                back()
                extend()
                forward()
                reset()
                wait(2)
                grab()
                extend()
                drop()
                back()
                grab()
                pivotClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                forward()
                extend()
                grab()
                retract()
                extend()
                drop()
                retract()
                back()
                grab()
                pivotClockwise()
                forward()
                extend()
                back()
                wait(2)
                forward()
                reset()
                wait(2)
                grab()
                extend()
                drop()
                back()
                grab()
                pivotClockwise()
                wait(1)
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
                grab()
                extend()
                reset()
                wait(3)
                grab()
                back()
                extend()
                forward()
                drop()
                back()
                extend()
                grab()
                retract()
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
        , 
        {
            sequence(1) {
                grab()
                retract()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(33)
                grab()
                retract()
                reset()
                wait(4)
                grab()
                retract()
                wait(8)
                extend()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(14)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                retract()
                wait(8)
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                grab()
                retract()
                reset()
                wait(2)
                grab()
                extend()
                reset()
                wait(8)
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(5)
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
        )
    }
}
