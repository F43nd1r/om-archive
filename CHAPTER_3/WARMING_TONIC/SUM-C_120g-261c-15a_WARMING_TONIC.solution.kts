
solution {
    puzzle = "P028"
    name = "B AC"
    arm(PISTON) {
        number = 1
        position = 1 to 1
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = 0 to 1
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -3 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to 3
        rotation = 0
    }
    track {
        position = 0 to 1
        positions = listOf(1 to -1, 0 to 0, 1 to 0, 1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                retract()
                forward()
                wait(2)
                retract()
                reset()
                wait(7)
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                extend()
                retract()
                pivotClockwise()
                pivotClockwise()
                retract()
                extend()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                retract()
                extend()
                pivotClockwise()
                drop()
                back()
                wait(5)
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
