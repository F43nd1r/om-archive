
solution {
    puzzle = "P024"
    name = "B ACX"
    arm(PISTON) {
        number = 1
        position = 1 to 0
        rotation = 6
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 3 to 1
        rotation = 2
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 3
        position = -1 to 3
        rotation = 5
        size = 1
    }
    glyph(UNBONDER) {
        position = 2 to 1
        rotation = 7
    }
    glyph(DUPLICATION) {
        position = 0 to 2
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 1 to 1
        rotation = 6
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 1 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 0 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = -2 to 3
        rotation = 0
    }
    track {
        position = 0 to 3
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                reset()
                wait(1)
                rotateCounterClockwise()
                wait(5)
                grab()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                wait(2)
                grab()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                grab()
                extend()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                rotateClockwise()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(18)
                back()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(4)
                forward()
                reset()
            }
        }
        )
    }
}
