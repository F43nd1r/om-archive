
solution {
    puzzle = "P105"
    name = "B CGX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 0 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to 1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to 2
        rotation = 5
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 9 to -2
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = 8 to -2
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 6 to 1
        rotation = 5
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 10 to 0
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 8 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 9 to -1
        rotation = 0
    }
    glyph(UNIFICATION) {
        position = 7 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 2
        rotation = 6
    }
    track {
        position = 2 to 2
        positions = listOf(-2 to -1, -2 to 0, -3 to 0)
    }
    conduit {
        id = 100
        position = 2 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = 8 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(9)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
                wait(1)
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                forward()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                back()
                back()
                drop()
                back()
                wait(1)
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(13)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(15)
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                extend()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
