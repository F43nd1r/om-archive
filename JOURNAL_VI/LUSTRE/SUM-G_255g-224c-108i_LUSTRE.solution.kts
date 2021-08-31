
solution {
    puzzle = "P090"
    name = "SUM-C 587"
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
        position = 1 to 1
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
    arm(ARM1) {
        number = 6
        position = -1 to -2
        rotation = 1
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
                wait(9)
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
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
            sequence(3) {
                wait(2)
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
                extend()
                pivotClockwise()
                pivotClockwise()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
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
            }
        }
        , 
        {
            sequence(1) {
                wait(11)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(5)
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(19)
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
                wait(1)
                back()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
