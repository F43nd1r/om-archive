
solution {
    puzzle = "P015"
    name = "AC"
    arm(PISTON) {
        number = 1
        position = 1 to 1
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -3 to 3
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 2 to 0
        rotation = -17
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = -2 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(1)
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                wait(6)
                grab()
                rotateClockwise()
                wait(7)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                retract()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
