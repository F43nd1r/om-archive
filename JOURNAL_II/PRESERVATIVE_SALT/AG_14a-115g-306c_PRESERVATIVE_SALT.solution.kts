
solution {
    puzzle = "P060"
    name = "B AC"
    arm(PISTON) {
        number = 1
        position = -1 to 2
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 1 to 0
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 0 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 2
        rotation = 0
    }
    track {
        position = -1 to 2
        positions = listOf(0 to 0, 1 to -1, 2 to -2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                retract()
                forward()
                drop()
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
                wait(6)
                extend()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                wait(6)
                grab()
                retract()
                wait(1)
                forward()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                retract()
                extend()
                pivotCounterClockwise()
                wait(4)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                retract()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                extend()
                back()
                grab()
                pivotClockwise()
                pivotClockwise()
                retract()
                extend()
                pivotClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                forward()
                reset()
            }
        }
        )
    }
}
