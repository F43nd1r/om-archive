
solution {
    puzzle = "P095"
    name = "W2"
    arm(PISTON) {
        number = 1
        position = -1 to 2
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -3 to 0
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -4 to -2
        rotation = -6
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -6 to -3
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -7 to -4
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -6 to -5
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = -3
    }
    glyph(PROJECTION) {
        position = -5 to -4
        rotation = -5
    }
    glyph(PURIFICATION) {
        position = -3 to -1
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -7 to -6
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = -6
    }
    track {
        position = -4 to -2
        positions = listOf(0 to 0, 0 to -1, -1 to 0)
    }
    track {
        position = -6 to -4
        positions = listOf(-1 to 0, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(67)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                wait(2)
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                forward()
                grab()
                back()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                extend()
                grab()
                retract()
                reset()
                wait(2)
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
            sequence(1) {
                grab()
                extend()
                reset()
                wait(15)
                grab()
                extend()
                reset()
                wait(13)
                grab()
                extend()
                reset()
                wait(10)
                grab()
                pivotCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(13)
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateClockwise()
                reset()
                wait(2)
                rotateCounterClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(30)
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                extend()
                grab()
                retract()
                rotateClockwise()
                drop()
                rotateClockwise()
                wait(17)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                retract()
                reset()
            }
        }
        )
    }
}
