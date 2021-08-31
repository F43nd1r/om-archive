
solution {
    puzzle = "P090"
    name = "B X S"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 1 to -1
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 0 to 2
        rotation = -3
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 2 to 0
        rotation = -3
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = 7 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 10 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 7 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 0 to 0
        rotation = -5
    }
    glyph(UNIFICATION) {
        position = 8 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 9 to 1
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = -2
    }
    track {
        position = 10 to -2
        positions = listOf(1 to 1, 0 to 1, 0 to 0)
    }
    track {
        position = 2 to 0
        positions = listOf(0 to 0, -1 to 1)
    }
    conduit {
        id = 100
        position = 6 to 0
        rotation = 0
        positions = listOf(0 to 0)
    }
    conduit {
        id = 100
        position = -1 to 2
        rotation = 0
        positions = listOf(0 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(11)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(13)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(5)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                retract()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                retract()
                reset()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                wait(21)
                grab()
                forward()
                reset()
                wait(2)
                grab()
                back()
                reset()
                wait(9)
                grab()
                back()
                rotateClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(2)
                back()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(4)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(5)
                retract()
                extend()
                pivotClockwise()
                pivotClockwise()
                retract()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                retract()
                reset()
            }
        }
        )
    }
}
